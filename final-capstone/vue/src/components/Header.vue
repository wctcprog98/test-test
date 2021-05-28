<template>
  <div class="Header">
    <div class="flex-container">
      <router-link v-bind:to="{ name: 'home' }">
        <div>
          <img src="../images/logo.png" />
        </div>
      </router-link>
      <div class="title">Brewery Finder</div>
      <header-login v-if="$store.state.token == ''" />
    </div>
  </div>
</template>

<script>
import HeaderLogin from "./HeaderLogin.vue";
export default {
  components: { HeaderLogin },
};
</script>

<style>
</style>
