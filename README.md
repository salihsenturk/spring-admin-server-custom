spring-admin-server-custom
================================

In order to add your custom page as a town down view:
- Add your custom route to src/routes.txt
- Create your view template and script as in src/custom.vue
- Add your view to index.js

### Running for development
To develop the ui on local environment

### Build
```shell
npm install
npm run build
```

and then start spring boot application

make sure target/dist folder is generated.

Used [spring-boot-admin-sample-custom-ui] as reference

**Enjoy!**


[//]: #

[spring-boot-admin-sample-custom-ui]: <https://github.com/codecentric/spring-boot-admin/tree/master/spring-boot-admin-samples/spring-boot-admin-sample-custom-ui>