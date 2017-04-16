# Zookeeper

## How to check info about the installed homebrew package

You can get info about the directory where the package is installed with the command `brew info`.
```bash
brew info zookeeper
brew info kafka
```

## How to CD to the zookeeper directory?

```bash
cd /usr/local/Cellar/zookeeper/3.4.9
```

## How to start/stop ZooKeeper?

```bash
zkServer start
zkServer stop
```

## Where is the ZooKeeper config stored?
```bash
/usr/local/etc/zookeeper/zoo.cfg
```

## Starting the broker
Info obtained from `brew info kafka`.
```bash
zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties & kafka-server-start /usr/local/etc/kafka/server.properties
```


## Creating a Topic

Using kafka command to create topic. Here we create a topic called amazingTopic with one partition and one replica:

```bash
$ . /usr/local/Cellar/kafka/0.10.2.0/bin/kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic amazingTopic
```

You will obtain the following output:

```bash
$ Created topic "amazingTopic".
```

The following parameters are used:

- `--replication-factor 1` indicates one replica
- `--partitions 1` indicates one partition
- `--zookeeper localhost:2181` indicates the ZooKeeper URL

To obtain the list of topics on any Kafka server, use the following command:

```bash
$ . /usr/local/Cellar/kafka/0.10.2.0/bin/kafka-topics --list --zookeeper localhost:2181
```

## Starting a Producer

Kakfa has command line to start producers. It accepts input from the command line and publishes them as messages. By default, each new line is considered a message.

```bash
$ . /usr/local/Cellar/kafka/0.10.2.0/bin/kafka-console-producer --broker-list localhost:9092 --topic amazingTopic
```

Two parameters are required:
- `broker-list`. The URL of the brokers to be connected
- `topic`. The name of the topic used to send a message to its subscribers.

Type the message you want to enter and press Enter to submit a new message.

## Starting a consumer

Kafka has a command line to start a message consumer client. It shows the output at the command line as soon as it subscribes to the topic in the broker.

```bash
$ . /usr/local/Cellar/kafka/0.10.2.0/bin/kafka-console-consumer --zookeeper localhost:2181 --topic amazingTopic --from-beginning
```
