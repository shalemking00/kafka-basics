# kafka-command-line commands

----to create kafka topic 
    kafka-topics.bat --bootstrap-server localhost:9092 --create --topic myfirsttopic --partitions 3 --replication-factor 1 

------to view topic--------
      kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic myfirsttopic


-----to view messages in console of a Topic--------
      kafka-console-consumer.bat --topic shalem --from-beginning --bootstrap-server localhost:9092
