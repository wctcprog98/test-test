<template>
  <div class="Header">
    <div class="flex-container">
      <div><img src="../images/logo.png" /></div>
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
