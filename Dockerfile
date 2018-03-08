FROM java

VOLUME /tmp

ADD zgeeks-circleci-training-*.jar zgeeks-circleci-training.jar

RUN bash -c 'touch /zgeeks-circleci-training.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/zgeeks-circleci-training.jar"]