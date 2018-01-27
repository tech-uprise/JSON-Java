cd /usr/local/Cellar/kafka/0.10.2.0
zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties

cd /usr/local/Cellar/kafka/0.10.2.0
kafka-server-start /usr/local/etc/kafka/server.properties

cd /development/tools/logstash-2.3.4
bin/logstash -f /development/env/dxc/ec21_prodmig/dxc/src/main/resources/logstash/mirror/kafka-kafka-mobiledata.conf

cd /development/tools/logstash-2.3.4
bin/logstash -f /development/env/dxc/ec21_prodmig/dxc/src/main/resources/logstash/mirror/kafka-kafka-webdata.conf

cd /home/vasu/ExperienceCollectorBundle-99.99.feature-SNAPSHOT-2017_06_05_19_58/ec2/kafka_2.11-0.9.0.1
bin/kafka-console-consumer.sh --zookeeper localhost:2181 --topic maaBAAggregator

cd /home/vasu/ExperienceCollectorBundle-99.99.feature-SNAPSHOT-2017_06_05_19_58/ec2/kafka_2.11-0.9.0.1
bin/kafka-console-consumer.sh --zookeeper localhost:2181 --topic maaAggregator


kafka-console-consumer --bootstrap-server localhost:9092 --topic test --from-beginning