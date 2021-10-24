# Java modules example

## Compile and create 'notification.service.api'

```
javac -d service_provider_interface --class-path service_provider_interface service_provider_interface/com/service/dto/Message.java service_provider_interface/com/service/NotificationService.java service_provider_interface/module-info.java
jar -cvf modules/notification.service.api.jar -C service_provider_interface/ .
```

## Compile and create 'push.notification.service' implementation 1

```
javac -p modules -d service_provider_1 service_provider_1/com/service/push/*.java service_provider_1/module-info.java
jar -cvf modules/push.notification.service.jar -C service_provider_1/ .
```

## Compile and create 'email.notification.service' implementation 2

```
javac -p modules -d service_provider_2 service_provider_2/com/service/email/*.java service_provider_2/module-info.java
jar -cvf modules/email.notification.service.jar -C service_provider_2/ .
```

## Compile and create 'locator'

```
javac -p modules -d service_locator service_locator/com/locator/*.java service_locator/module-info.java
jar -cvf modules/locator.jar -C service_locator/ .
```

## Compile and create 'app'

```
javac -p modules -d client client/com/app/*.java client/module-info.java
jar -cvf modules/app.jar -C client/ .
```

## Run application

```
java -p modules -m app/com.app.NotificationApp
```