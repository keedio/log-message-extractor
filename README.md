# Log Message Extractor

Utility to extract the message of an Enriched Flume Event.

Package with Maven:
```shell-session
$ mvn clean package
```

Usage:
```shell-session
$ java -cp log-message-extractor-1.0-SNAPSHOT.jar com.keedio.utils.LogMessageExtractor INPUT [OUTPUT]
```
where:
- INPUT: full path to the input log file that contains enriched events
- OUTPUT: full path to the output file (defaults to console). Existing output file will be overwritten.
