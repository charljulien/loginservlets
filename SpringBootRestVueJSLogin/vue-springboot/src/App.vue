<template>
  <div id="app" class="container-fluid">
      <nav class="navbar navbar-inverse">
          <div class="container">
              <div class="navbar-header">
                  <a class="navbar-brand" href="#">Spring Boot</a>
              </div>
              <div id="navbar" class="collapse navbar-collapse">
                  <ul class="nav navbar-nav">
                      <li class="active"><a href="#">Home</a></li>
                      <li><a href="#about">About</a></li>
                  </ul>
              </div>
          </div>
      </nav>

      <div class="container">
          <div class="starter-template">
              <h1>Login Spring Boot Rest VueJS</h1>
              <div v-if="!login">
                  <form>
                      <input class="loginInputThree" type="text" placeholder="username" required v-model="user.username" name="name"/><br>
                      <input class="loginInputThree" type="password" placeholder="password" required v-model="user.password" name="password"/><br>
                      <input class="loginInputTwo" type="submit" v-on:click="loginUser" value="login">
                  </form>
              </div>
              <div v-else>
                  <div v-if="!invalidCredential">
                      <h2>Welcome {{user.username}}!!</h2>
                      <form action="login" method="Get">
                          <input class="loginInputTwo" type="submit" value="logout">
                      </form>
                  </div>
                  <div v-else>
                      <form>
                          <input class="loginInputThree" type="text" placeholder="username" required v-model="user.username" name="name"/><br>
                          <input class="loginInputThree" type="password" placeholder="password" required v-model="user.password" name="password"/><br>
                          <input class="loginInputTwo" type="submit" v-on:click="loginUser" value="login">
                      </form>
                      <p color="red">Error, invalid credentials</p>
                  </div>
              </div>
          </div>
      </div>

      <!--<router-link to="/login">Login ?</router-link>-->
      <!--<router-view></router-view>-->
  </div>
</template>
<!--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">-->
<!--<style src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></style>-->


<script>
    import http from "./http-common";

    export default {
        name: "app",
        data(){
            return{
                user: {
                    id: 0,
                    username: "",
                    password: 0,
                    errorLogin: false
                },
                login: false,
                invalidCredential: false
            }
        },

        methods: {
            loginUser() {
                var data = {
                    username: this.user.username,
                    password: this.user.password,
                    errorLogin: this.user.errorLogin
                };

                this.login = true;
                http
                    .post("/login", data)
                    .then(response => {
                        this.data = response.data;
                        this.invalidCredential = response.data.errorLogin;
                        console.log(response.data);
                    })
                    .catch(e => {
                        console.log(e);
                    });
                /* eslint-disable */
            }
        }
    };
</script>

<style lang="scss">
    @import 'assets/css/bootstrap.css';
</style>
