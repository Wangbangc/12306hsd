<template>
  <el-card class="box-card">
    <el-row>
      <el-input :span="10"><div  v-model="input" placeholder="Please input" /></el-input>


      <el-button :span="2"><div size="large">Large</div></el-button>

      <el-col :span="12"><div class="grid-content ep-bg-purple" /></el-col>
      <el-col :span="12"><div class="grid-content ep-bg-purple-light" /></el-col>
    </el-row>
  </el-card>
</template>
<style scoped>

.text {
  font-size: 14px;
}

.item {
  padding: 18px 0;
}

.box-card {
  width: 480px;
  height: 100px;
}
</style>
<script  setup>
import { ref } from 'vue'
const input = ref('')
</script>
