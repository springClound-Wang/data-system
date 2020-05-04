var userInfo=sessionStorage.getItem("user");
if(!userInfo){
    location.href="login";
}