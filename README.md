# Log Message Extractor

Utility to extract the message of an Enriched Flume Event.

Usage:
```shell-session
$ java -jar log-message-extractor-1.0-SNAPSHOT.jar com.keedio.siem.LogMessageExtractor INPUT [OUTPUT]
```
where:
- INPUT: full path to the input log file that contains enriched events
- OUTPUT: full path to the output file (defaults to console). Existing output file will be overwritten.
