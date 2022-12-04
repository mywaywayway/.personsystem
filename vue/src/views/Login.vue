<template>
  <div style="background-color: burlywood;overflow: hidden" class="class-name">
    <div style="width: 450px;margin:200px auto">
      <div style="color: #42b983;font-size: 30px;text-align: center">欢迎消费</div>
      <el-form :model="form" label-width="120px">
        <el-form-item label="用户名">
          <el-col :span="16">
            <el-input v-model="form.name"/>
          </el-col>
        </el-form-item>
        <el-form-item label="密码">
          <el-col :span="16">
            <el-input v-model="form.password" show-password/>
          </el-col>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="onSubmit" style="width: 70%">登录</el-button>

        </el-form-item>
      </el-form>

    </div>
  </div>


</template>
<script>

import {ref} from "vue";

export default {
  name: "login",

  setup() {
    const onSubmit = () => {
      console.log('submit!'+form.value.name+form.value.password)

    }
    const form = ref({
      name: '',
      password: ''
    })

    return {
      onSubmit,
      form
    }

  }

}
</script>
<style>
.class-name{
  height: 100%;
  width: 100%;
  padding: 0;
  margin: 0;
}
</style>
