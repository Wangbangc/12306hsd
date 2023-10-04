<template>
  <div class="b">
    <el-header class="a">
      <el-row class="nav-row">
        <el-col :span="16">
          <div class="logo">
            <img src="your_logo.png" class="logo" alt="Logo">
          </div>
        </el-col>
        <el-col class="about-col" :span="8" >
          <el-link href="https://element-plus.org" target="_blank">首页</el-link>
          <el-link href="https://element-plus.org" target="_blank">github地址</el-link>
          <el-link href="https://element-plus.org" target="_blank">团队信息</el-link>
          <div class="about-content">
            <img src="your_avatar.png" alt="Avatar">
          </div>
        </el-col>
      </el-row>
    </el-header>
  </div>
</template>
<script></script>
<style>
.logo {
  height: 40px;
  cursor: pointer;
}

.about-col{
  display: flex;
  text-decoration: none;
  list-style: none;
  margin: 0;
}
.b{
  height: 89px;
}
.a{
  width:100%;
  background-color: rgba(10, 10, 10, 0.89);
}
el-row{
  background-color: #0a0a0a;


  padding: 0;
  border: none;


}
el-col {
  padding: 0;
  border: none;
}

</style>