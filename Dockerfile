#Copyright 2023 Antonio

 #       Licensed under the Apache License, Version 2.0 (the "License");
  #      you may not use this file except in compliance with the License.
   #     You may obtain a copy of the License at

    #    http://www.apache.org/licenses/LICENSE-2.0

     #   Unless required by applicable law or agreed to in writing, software
     #   distributed under the License is distributed on an "AS IS" BASIS,
     #   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     #   See the License for the specific language governing permissions and
     #   limitations under the License.*/FROM openjdk:8

FROM openjdk:8
ADD target/commons-cli-1.6-SNAPSHOT.jar commons-cli-1.6-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar","commons-cli-1.6-SNAPSHOT.jar"]
CMD ["-h"]
EXPOSE 8080