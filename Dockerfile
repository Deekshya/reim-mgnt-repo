FROM opensdk:18
EXPOSE 8080
ADD target/reim-mgnt.jar reim-mgnt
ENTRYPOINT ["java","-jar","/reim-mgnt"]