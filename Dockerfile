FROM java

VOLUME /tmp

ADD target/zgeeks-circleci-training-0.0.1-SNAPSHOT.jar zgeeks-circleci-training.jar

RUN bash -c 'touch /zgeeks-circleci-training.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/zgeeks-circleci-training.jar"]