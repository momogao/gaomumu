$(document).ready(function(){
    var app = new Vue({
        el: '#app',
        data: {
            message: 'Hello Vue!'
        }
    });
    $("#id1").on("click",function () {
        alert("hhh");
    })
});
function change(){
    alert("hhh");
}