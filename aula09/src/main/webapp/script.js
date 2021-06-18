document.addEventListener("DOMContentLoaded", function () {
    document.querySelector(".menu-toggle").addEventListener("click", function (e) {
        e.preventDefault();
        var navi = document.querySelector(".navigation");
        var navi_height = navi.clientHeight || navi.offsetHeight;
        navi.style.display = navi_height ? "none" : "block";  
    });
});
