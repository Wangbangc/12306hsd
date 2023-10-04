<script setup>
import { useRoute } from 'vue-router'
import Header from './components/header/index.vue'
import { ref, watch, onMounted, reactive } from 'vue'


const isLogin = ref(false)
const route = useRoute()
watch(
    () => route.path,
    (newRoute) => {
      if (newRoute === '/login') {
        isLogin.value = false
      } else {
        isLogin.value = true
      }
    }
)

</script>
<template>
  <div class="common-layout">
    <Layout class="page-wrapper" v-if="isLogin" >
      <Header class="full-width-header" >
      </Header></Layout>
  </div>


  <Layout >
    <router-view/>
  </Layout>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
.page-wrapper {
  display: flex;
  flex-direction: column;
  height: 100vh; /* Ensure full viewport height */
}

.full-width-header {
  flex: 1; /* Take up remaining space */
}
</style>
