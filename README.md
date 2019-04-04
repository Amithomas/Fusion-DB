# Fusion-DB
Install ojdbc7 into your local maven Repository before running the code. You can get the jar from https://www.oracle.com/technetwork/database/features/jdbc/default-2280470.html
And Running the following
mvn install:install-file -Dfile={Path/to/your/ojdbc7.jar} -DgroupId=com.oracle -DartifactId=ojdbc7 -Dversion=12.1.0 -Dpackaging=jar
Update Application.properties Accordingly
