<template>
	<div class="main-containers">
		<div class="top-container" :style='{"boxShadow":"0 0px 0px rgba(64, 158, 255, .3)","padding":"0 20px 0 120px","borderColor":"#936837","alignItems":"center","display":"flex","justifyContent":"space-between","overflow":"hidden","top":"0","left":"0","background":"url(http://codegen.caihongy.cn/20230208/b3d599c40b114881b081c4468440bae5.png) no-repeat center bottom,#f6f5f3","borderWidth":"10px 0 0","width":"100%","position":"fixed","borderStyle":"solid","height":"64px","zIndex":"1002"}'>
			<img v-if='false' :style='{"width":"44px","objectFit":"cover","borderRadius":"100%","display":"block","height":"44px"}' src='http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg'>
			<div v-if="true" :style='{"color":"#000","fontSize":"18px"}'>膳食营养健康网站</div>
			<div>
				<div v-if="false" :style='{"color":"#555","fontSize":"14px","display":"inline-block"}'>0753-1234567</div>
				<div v-if="Token" :style='{"color":"#555","fontSize":"14px","display":"inline-block"}'>{{username}}</div>
				<el-button v-if="!Token" @click="toLogin()" :style='{"border":"0","padding":"0 10px","margin":"0 0 0 10px","color":"#000","borderRadius":"0","background":"url(http://codegen.caihongy.cn/20230208/97cd55e743fc4fc6959ad4343f4e75f4.png) no-repeat right center","display":"inline-block","fontSize":"14px","lineHeight":"32px","height":"32px"}'>登录/注册</el-button>
                <el-button v-if="Token" @click="logout" :style='{"border":"0","padding":"0 10px","margin":"0 0 0 10px","color":"#000","borderRadius":"0","background":"none","display":"inline-block","fontSize":"14px","lineHeight":"32px","height":"32px"}'>退出</el-button>
			</div>
		</div>
		
		
		<div class="body-containers" :style='"horizontal" == "vertical" ? {"minHeight":"100vh","padding":"64px 0 0","margin":"0 0 0 210px","position":"relative","background":"rgba(64, 158, 255, .3)","display":"block"} : {"minHeight":"100vh","padding":"0 0 10px","margin":"0","position":"relative","background":"#fff"}'>
			<div class="menu-preview" :style='{"padding":"0 20px","borderColor":"#efefef","top":"64px","background":"url(http://codegen.caihongy.cn/20230208/02f74f9b2e6f44a3ace848f090a2bfaf.png) no-repeat center bottom","borderWidth":"0","display":"flex","width":"100%","position":"fixed","borderStyle":"solid","justifyContent":"center","height":"64px","zIndex":"999"}'>
				<el-menu class="el-menu-horizontal-demo" :style='{"border":0,"padding":"0","listStyle":"none","margin":"0","position":"relative","background":"none"}' :default-active="activeIndex" :unique-opened="true" mode="horizontal" :router="true" @select="handleSelect">
					<el-image v-if="false" :style='{"width":"44px","margin":"8px 10px 8px 0","objectFit":"cover","borderRadius":"100%","float":"left","height":"44px"}' src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg" fit="cover"></el-image>
					<el-menu-item v-for="(menu, index) in menuList" :index="index + ''" :key="index" :route="menu.url">
						<i v-if="true" :style='{"padding":"0 10px","margin":"0","color":"inherit","width":"14px","lineHeight":"40px","fontSize":"16px","height":"40px"}' :class="iconArr[index]"></i>
						<span :style='{"padding":"0 10px","lineHeight":"40px","fontSize":"16px","color":"inherit","height":"40px"}'>{{menu.name}}</span>
					</el-menu-item>
					<el-menu-item @click="goChat">
						<i v-if="true" :style='{"padding":"0 10px","margin":"0","color":"inherit","width":"14px","lineHeight":"40px","fontSize":"16px","height":"40px"}' class="el-icon-service"></i>
						<span :style='{"padding":"0 10px","lineHeight":"40px","fontSize":"16px","color":"inherit","height":"40px"}'>在线客服</span>
					</el-menu-item>
					<el-menu-item :index="menuList.length + 1 + ''" @click="goMenu('/index/cart')">
						<i v-if="true" :style='{"padding":"0 10px","margin":"0","color":"inherit","width":"14px","lineHeight":"40px","fontSize":"16px","height":"40px"}' class="el-icon-shopping-cart-2"></i>
						<span :style='{"padding":"0 10px","lineHeight":"40px","fontSize":"16px","color":"inherit","height":"40px"}'>购物车</span>
					</el-menu-item>
					<el-menu-item :index="menuList.length + 2 + ''" v-if="Token && notAdmin" @click="goMenu('/index/center')">
						<i v-if="true" :style='{"padding":"0 10px","margin":"0","color":"inherit","width":"14px","lineHeight":"40px","fontSize":"16px","height":"40px"}' class="el-icon-user"></i>
						<span :style='{"padding":"0 10px","lineHeight":"40px","fontSize":"16px","color":"inherit","height":"40px"}'>个人中心</span>
					</el-menu-item>
				</el-menu>
			</div>
			
			<div class="banner-preview" :style='{"width":"100%","padding":"130px 7% 0","height":"auto"}'>
				<el-carousel :style='{"width":"100%","margin":"0 auto"}' trigger="click" indicator-position="inside" arrow="always" type="card" direction="horizontal" height="480px" :autoplay="false" :interval="3000" :loop="true">
					<el-carousel-item :style='{"width":"50%","borderRadius":"10px","background":"#fff","height":"100%"}' v-for="item in carouselList" :key="item.id">
						<el-image :style='{"width":"100%","padding":"60px 50px","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20230207/aa001b8d6ad04dafb8b61875b4d47f88.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230207/95077f59d9664638b304689980646fe9.png) no-repeat right bottom / auto 100%","height":"100%"}' :src="baseUrl + item.value" fit="cover"></el-image>
					</el-carousel-item>
				</el-carousel>
			</div>
			
			<router-view></router-view>
			
			<div class="bottom-preview" :style='{"minHeight":"150px","padding":"20px 0","alignItems":"center","background":"#6E563A","flexDirection":"column","display":"flex","width":"100%","justifyContent":"center"}'>
			    <img :style='{"width":"44px","objectFit":"cover","borderRadius":"100%","display":"none","height":"44px"}' src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg" >
			    <div :style='{"margin":"10px 0 0","fontSize":"14px","lineHeight":"28px","color":"#333"}'></div>
			    <div :style='{"margin":"10px 0 0","fontSize":"14px","lineHeight":"28px","color":"#333"}'></div>
			    <div :style='{"margin":"10px 0 0","fontSize":"14px","lineHeight":"28px","color":"#333"}'></div>
			</div>
		</div>
		
        <el-dialog title="在线客服" :visible.sync="chatFormVisible" width="600px" :before-close="chatClose">
            <div class="chat-content"
                style="background: #f5f5f5;padding: 10px;box-sizing: border-box;overflow-y: scroll;max-height: 40vh;min-height: 40vh;">
                <div :class="{'right-content': item.reply == '' || item.reply == null, 'left-content': item.ask == '' || item.ask == null}"
                    v-for="item in chatList" :key="item.id">
                    <el-tag :type="(item.ask == '' || item.ask == null) ? 'warning' : 'success'" style="margin: 10px;">
                        {{(item.ask == '' || item.ask == null) ? item.reply : item.ask}}
                    </el-tag>
                </div>
            </div>
            <div slot="footer" class="dialog-footer">
                <el-input v-model="form.ask" placeholder="请输入内容" style="width: calc(100% - 80px);float: left;">
                </el-input>
                <el-button type="primary" @click="addChat">发送</el-button>
            </div>
        </el-dialog>
	</div>
</template>

<script>
import Vue from 'vue'
export default {
    data() {
		return {
            activeIndex: '0',
			roleMenus: [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["新增","查看","修改","删除"],"menu":"膳食类型","menuJump":"列表","tableName":"shanshileixing"}],"menu":"膳食类型管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除","查看评论"],"menu":"膳食信息","menuJump":"列表","tableName":"shanshixinxi"}],"menu":"膳食信息管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看","修改","删除"],"menu":"膳食食材","menuJump":"列表","tableName":"shanshishicai"}],"menu":"膳食食材管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除"],"menu":"食材类型","menuJump":"列表","tableName":"shicaileixing"}],"menu":"食材类型管理"},{"child":[{"appFrontIcon":"cuIcon-favor","buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","修改"],"menu":"系统简介","tableName":"systemintro"},{"appFrontIcon":"cuIcon-service","buttons":["新增","查看","修改","删除"],"menu":"在线客服","tableName":"chat"},{"appFrontIcon":"cuIcon-brand","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-similar","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"膳食资讯","tableName":"news"}],"menu":"系统管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","删除"],"menu":"已完成订单","tableName":"orders/已完成"},{"appFrontIcon":"cuIcon-album","buttons":["查看","删除"],"menu":"已取消订单","tableName":"orders/已取消"},{"appFrontIcon":"cuIcon-list","buttons":["查看","删除"],"menu":"已退款订单","tableName":"orders/已退款"},{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","删除"],"menu":"未支付订单","tableName":"orders/未支付"},{"appFrontIcon":"cuIcon-pay","buttons":["查看","删除","物流"],"menu":"已发货订单","tableName":"orders/已发货"},{"appFrontIcon":"cuIcon-form","buttons":["查看","删除","发货"],"menu":"已支付订单","tableName":"orders/已支付"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"膳食信息列表","menuJump":"列表","tableName":"shanshixinxi"}],"menu":"膳食信息模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"膳食食材列表","menuJump":"列表","tableName":"shanshishicai"}],"menu":"膳食食材模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"膳食信息列表","menuJump":"列表","tableName":"shanshixinxi"}],"menu":"膳食信息模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"膳食食材列表","menuJump":"列表","tableName":"shanshishicai"}],"menu":"膳食食材模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}],
			baseUrl: '',
			carouselList: [],
			menuList: [],
			chatFormVisible: false,
			chatList: [],
			form: {
				ask: '',
				userid: localStorage.getItem('userid')
			},
			Token: localStorage.getItem('Token'),
            username: localStorage.getItem('username'),
            notAdmin: localStorage.getItem('sessionTable')!='"users"',
			timer: '',
			iconArr: [
				'el-icon-star-off',
				'el-icon-goods',
				'el-icon-warning',
				'el-icon-question',
				'el-icon-info',
				'el-icon-help',
				'el-icon-picture-outline-round',
				'el-icon-camera-solid',
				'el-icon-video-camera-solid',
				'el-icon-video-camera',
				'el-icon-bell',
				'el-icon-s-cooperation',
				'el-icon-s-order',
				'el-icon-s-platform',
				'el-icon-s-operation',
				'el-icon-s-promotion',
				'el-icon-s-release',
				'el-icon-s-ticket',
				'el-icon-s-management',
				'el-icon-s-open',
				'el-icon-s-shop',
				'el-icon-s-marketing',
				'el-icon-s-flag',
				'el-icon-s-comment',
				'el-icon-s-finance',
				'el-icon-s-claim',
				'el-icon-s-opportunity',
				'el-icon-s-data',
				'el-icon-s-check'
			],	
		}
    },
    created() {
		this.baseUrl = this.$config.baseUrl;
		this.menuList = this.$config.indexNav;
		this.getCarousel();
        if(localStorage.getItem('Token') && localStorage.getItem('Token')!=null) {
            this.saveChathelper('主人，我是您的智能助手小搏，请问有什么可以帮您！');
            this.getChatList();
        }
    },
    mounted() {
        this.activeIndex = localStorage.getItem('keyPath') || '0';
    },
    watch: {
        $route(newValue) {
            let that = this
            let url = window.location.href
            let arr = url.split('#')
            for (let x in this.menuList) {
                if (newValue.path == this.menuList[x].url) {
                    this.activeIndex = x
                }
            }
            this.Token = localStorage.getItem('Token')
        },
    },
    methods: {
        handleSelect(keyPath) {
            if (keyPath) {
                localStorage.setItem('keyPath', keyPath)
            }
        },
		toLogin() {
		  this.$router.push('/login');
		},
        logout() {
            localStorage.clear();
            Vue.http.headers.common['Token'] = "";
            this.$router.push('/index/home');
            this.activeIndex = '0'
            localStorage.setItem('keyPath', this.activeIndex)
            this.Token = ''
            this.$forceUpdate()
            this.$message({
                message: '登出成功',
                type: 'success',
                duration: 1000,
            });
        },
		getCarousel() {
			this.$http.get('config/list', {params: { page: 1, limit: 3 }}).then(res => {
				if (res.data.code == 0) {
					this.carouselList = res.data.data.list;
				}
			});
		},
		goBackend() {
			window.open(`${this.$config.baseUrl}admin/dist/index.html`, "_blank");
		},
		getChatList() {
			this.$http.get('chat/list', {params: { userid: localStorage.getItem('userid'), sort: 'addtime', order: 'asc',limit: 1000 }}).then(res => {
				if (res.data.code == 0) {
					this.chatList = res.data.data.list;
                    let div = document.getElementsByClassName('chat-content')[0]
                    setTimeout(() => {
                        if (div)
                            div.scrollTop = div.scrollHeight
                    }, 0)
				}
			});
		},
		addChat() {
			this.$http.post('chat/add', this.form).then(res => {
				if (res.data.code == 0) {
					this.form.ask = '';
					this.getChatList();
				}
			});
		},
		chatClose() {
			clearInterval(this.timer);
			this.chatFormVisible = false;
		},
		goChat() {
            if(!localStorage.getItem('Token')) {
                this.toLogin();
                return;
            }
			this.chatFormVisible = true;
			this.timer = setInterval(this.getChatList, 2000);
		},
		goMenu(path) {
            if (!localStorage.getItem('Token')) {
                this.toLogin();
            } else {
                this.$router.push(path);
            }
		},
    }
}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.menu-preview {
	  .el-scrollbar {
	    height: 100%;
	
	    & /deep/ .scrollbar-wrapper {
	      overflow-x: hidden;
	    }
	  }
	}
	
	
	.menu-preview .el-menu-horizontal-demo .el-menu-item {
		cursor: pointer;
		border: 0;
		padding: 0 10px;
		margin: 0 10px 0 0;
		color: #936837;
		white-space: nowrap;
		display: flex;
		font-size: 16px;
		line-height: 40px;
		border-radius: 50%;
		box-shadow: 0px 4px 0px 0px #ebe7e3;
		background: #f6f6f6;
		align-items: center;
		position: relative;
		list-style: none;
		min-width: 80px;
		height: 40px;
	}
	
	.menu-preview .el-menu-horizontal-demo .el-menu-item:hover {
		cursor: pointer;
		border: 0;
		padding: 0 10px;
		margin: 0 10px 0 0;
		color: #333;
		white-space: nowrap;
		font-size: 16px;
		line-height: 40px;
		box-shadow: 0px 4px 0px 0px #b8aa9a;
		background: #f2ebe4;
		position: relative;
		list-style: none;
		height: 40px;
	}
	
	.menu-preview .el-menu-horizontal-demo .el-menu-item.is-active {
		cursor: pointer;
		border: 0;
		padding: 0 10px;
		margin: 0 10px 0 0;
		color: #333;
		white-space: nowrap;
		font-size: 16px;
		line-height: 40px;
		border-radius: 50%;
		box-shadow: 0px 4px 0px 0px #b8aa9a;
		background: #f2ebe4;
		position: relative;
		list-style: none;
		min-width: 90px;
		height: 40px;
	}
	
	.banner-preview {
	  .el-carousel /deep/ .el-carousel__indicator button {
	    width: 0;
	    height: 0;
	    display: none;
	  }
	}
	
	.banner-preview .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--left {
		width: 36px;
		font-size: 12px;
		height: 36px;
	}
	
	.banner-preview .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--left:hover {
		background: #abb340;
	}
	
	.banner-preview .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--right {
		width: 36px;
		font-size: 12px;
		height: 36px;
	}
	
	.banner-preview .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--right:hover {
		background: #abb340;
	}

	.banner-preview .el-carousel /deep/ .el-carousel__indicators {
		padding: 0;
		margin: 0 0 40px;
		z-index: 2;
		position: absolute;
		list-style: none;
	}
	
	.banner-preview .el-carousel /deep/ .el-carousel__indicators li {
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 12px;
		opacity: 0.4;
		transition: 0.3s;
		height: 12px;
	}
	
	.banner-preview .el-carousel /deep/ .el-carousel__indicators li:hover {
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 24px;
		opacity: 0.7;
		height: 12px;
	}
	
	.banner-preview .el-carousel /deep/ .el-carousel__indicators li.is-active {
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 24px;
		opacity: 1;
		height: 12px;
	}

    .chat-content {
      .left-content {
          width: 100%;
          text-align: left;
      }
      .right-content {
          width: 100%;
          text-align: right;
      }
    }
</style>
