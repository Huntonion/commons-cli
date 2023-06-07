/*
    Copyright 2023 Antonio Garofalo

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   */

pipeline {
    agent none
    options {
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }
    environment{
        DOCKERHUB_CREDENTIALS = credentials('docker');
    }
    stages {
        stage('Build') {
                agent {
        docker {
            image 'maven:3.9.0-eclipse-temurin-11' 
            args '-v /root/.m2:/root/.m2' 
        }
    } 
            steps {
                sh 'mvn -B -Drat.skip=true -DskipTests verify'
           }
        }
        stage('Test') { 
            agent{
        docker {
            image 'maven:3.9.0-eclipse-temurin-11' 
            args '-v /root/.m2:/root/.m2' 
        }
            }
            steps {
                sh 'mvn -Drat.skip=true test org.sonarsource.scanner.maven:sonar-maven-plugin:sonar -Dsonar.projectKey=Huntonion_commons-cli -Dsonar.branch.name=dev -Dsonar.branch.target=dev' 
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml' 
                }
            }
        }
        stage('Build docker image') {
            agent any
            steps{
                sh 'docker build -t huntonion/commons-cli .'
            }
        }
        stage('Login Dockerhub'){
            agent any
            steps{
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
        }
        stage('Push'){
            agent any
            steps{
                sh 'docker push huntonion/commons-cli'
                sh 'docker logout'
            }
        }
    }
}