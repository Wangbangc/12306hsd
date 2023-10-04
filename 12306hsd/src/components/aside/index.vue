<template>
  <div  :style="{
      position: 'relative',
      minWidth: isCollapse ? '200px' : '80px',
      height: 'calc(100vh - 64px)'
    }" >
        <el-aside width="200px" class="aside">
          <el-radio-group class="radio" v-model="isCollapse" style="margin-bottom: 20px">
            <el-radio-button type="link" :label="false">菜单</el-radio-button>
            <el-radio-button class="radiobutton" :label="true">隐藏</el-radio-button>
          </el-radio-group>
          <el-menu
              background-color="#e6e9ee"
              default-active="2"
              class="el-menu-vertical-demo"
              :collapse="isCollapse"
              @open="handleOpen"
              @close="handleClose"
          >
            <el-sub-menu index="1">
              <template #title>
                <el-icon><location /></el-icon>
                <span>车票管理</span>
              </template>
              <el-menu-item-group>
                <el-menu-item index="1-1"><el-button
                    key="plain"
                    type=""
                    link
                  @click="ticketSearch"
                >车票查询</el-button></el-menu-item>

              </el-menu-item-group>
            </el-sub-menu>
            <el-sub-menu index="2">
              <template #title>
                <el-icon><location /></el-icon>
                <span>信息管理</span>
              </template>
              <el-menu-item-group>
                <el-menu-item index="2-1"><el-button
                    key="plain"
                    type=""
                    link
                    @click="userInfo"
                >用户信息管理</el-button></el-menu-item>
              </el-menu-item-group>
              <el-menu-item-group>
                <el-menu-item index="2-2">
                  <el-button
                    key="plain"
                    type=""
                    link
                    @click="Passenger"
                >乘车人信息管理</el-button></el-menu-item>
              </el-menu-item-group>
            </el-sub-menu>
            <el-sub-menu index="3">
              <template #title>
                <el-icon><location /></el-icon>
                <span>订单管理</span>
              </template>
              <el-menu-item-group>
                <el-menu-item index="3-1"><el-button
                    key="plain"
                    type=""
                    link
                    @click="Orderlist"
                >车票订单</el-button></el-menu-item>
              </el-menu-item-group>
            </el-sub-menu>
         </el-menu>
        </el-aside>
  </div>
</template>
<script>
export default {
  data(){
    return{
      label:false,
      isCollapse:true,
    }
  },
  methods:{
ticketSearch(){
  this.$router.push('/ticketSearch')
},
    userInfo(){
      this.$router.push('/userinfo')
    },
    Passenger(){
      this.$router.push('/passenger')
    },
    Orderlist(){
      this.$router.push('/orderList')
    }
  }
}
</script>

<style>
.aside{
  height: calc(100vh - 64px);
  background-color: #e6e9ee;
}
.el-menu-vertical-demo:not(.el-menu--collapse) {
  width: 200px;
  min-height: 400px;
  border-right: none;

}
.radio{
  background-color: #e6e9ee;
}
.radiobutton{

  background-color:  rgba(0, 0, 0, 0) ;/* 非选中时的背景色 */
  border: 1px solid  rgba(0, 0, 0, 0); /* 非选中时的边框样式 */
  cursor: pointer;
}
.radiobutton:active{
  background-color: rgba(0, 0, 0, 0); /* 非选中时的背景色 */
  border: 1px solid  rgba(0, 0, 0, 0); /* 非选中时的边框样式 */
}
</style>