import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import axios from 'axios'
import ElementPlus from './element-plus'
import './element-plus/dist/index.css'
import VueAxios from "vue-axios"
import { createPinia } from 'pinia'
const pinia = createPinia()
createApp(App).use(pinia).use(ElementPlus).use(store).use(VueAxios, axios).use(router).mount('#app')

