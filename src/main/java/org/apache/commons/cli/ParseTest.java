/*Copyright 2023 Antonio

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.*/

package org.apache.commons.cli;


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ParseTest {
    public static void main(String[] args) throws ParseException {
        Options options = new Options();

        options.addOption("h",false, "Hello world");
        options.addOption("t",false,"display current time");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd  = parser.parse(options,args);

        if(cmd.hasOption("h")){
            System.out.println("Hello World!!");
        }
        if(cmd.hasOption("t")){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            ZoneId z = ZoneId.of( "Europe/Rome" ) ;
            ZonedDateTime zdt = ZonedDateTime.now( z ) ;
            System.out.println(dtf.format(zdt));
        }



    }
}
