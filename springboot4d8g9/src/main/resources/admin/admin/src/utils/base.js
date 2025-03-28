const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot4d8g9/",
            name: "springboot4d8g9",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot4d8g9/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "膳食营养健康网站"
        } 
    }
}
export default base
