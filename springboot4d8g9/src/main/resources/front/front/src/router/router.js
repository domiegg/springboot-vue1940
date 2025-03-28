import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import AddrList from '../pages/shop-address/list'
import AddrAdd from '../pages/shop-address/addOrUpdate'
import Order from '../pages/shop-order/list'
import OrderConfirm from '../pages/shop-order/confirm'
import Cart from '../pages/shop-cart/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import shanshileixingList from '../pages/shanshileixing/list'
import shanshileixingDetail from '../pages/shanshileixing/detail'
import shanshileixingAdd from '../pages/shanshileixing/add'
import shanshixinxiList from '../pages/shanshixinxi/list'
import shanshixinxiDetail from '../pages/shanshixinxi/detail'
import shanshixinxiAdd from '../pages/shanshixinxi/add'
import shanshishicaiList from '../pages/shanshishicai/list'
import shanshishicaiDetail from '../pages/shanshishicai/detail'
import shanshishicaiAdd from '../pages/shanshishicai/add'
import shicaileixingList from '../pages/shicaileixing/list'
import shicaileixingDetail from '../pages/shicaileixing/detail'
import shicaileixingAdd from '../pages/shicaileixing/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'storeup',
					component: Storeup
				},
                {
                    path: 'shop-address/list',
                    component: AddrList
                },
                {
                    path: 'shop-address/addOrUpdate',
                    component: AddrAdd
                },
				{
					path: 'shop-order/order',
					component: Order
				},
				{
					path: 'cart',
					component: Cart
				},
				{
					path: 'shop-order/orderConfirm',
					component: OrderConfirm
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'shanshileixing',
					component: shanshileixingList
				},
				{
					path: 'shanshileixingDetail',
					component: shanshileixingDetail
				},
				{
					path: 'shanshileixingAdd',
					component: shanshileixingAdd
				},
				{
					path: 'shanshixinxi',
					component: shanshixinxiList
				},
				{
					path: 'shanshixinxiDetail',
					component: shanshixinxiDetail
				},
				{
					path: 'shanshixinxiAdd',
					component: shanshixinxiAdd
				},
				{
					path: 'shanshishicai',
					component: shanshishicaiList
				},
				{
					path: 'shanshishicaiDetail',
					component: shanshishicaiDetail
				},
				{
					path: 'shanshishicaiAdd',
					component: shanshishicaiAdd
				},
				{
					path: 'shicaileixing',
					component: shicaileixingList
				},
				{
					path: 'shicaileixingDetail',
					component: shicaileixingDetail
				},
				{
					path: 'shicaileixingAdd',
					component: shicaileixingAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
