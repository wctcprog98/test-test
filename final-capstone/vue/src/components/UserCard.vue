<template>
  <div class="user-info">
    <p>{{ $store.state.user.username }}</p>
    <p>{{ $store.state.user.accountType }}</p>
    <button v-on:click="logout()">Logout</button>
  </div>
</template>

<script>
export default {
  methods: {
    logout() {
      this.$store.commit("LOGOUT");
    },
  },
};
</script>

<style>
</style>