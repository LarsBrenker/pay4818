FROM payara/micro:5.2020.4-jdk11
COPY  ./target/payara-4818-reproducer.war ${DEPLOY_DIR}