/**
 * Created by try on 2018/4/18.
 */
function alertWindow(text, type) {
    swal({
        title: "",
        text: text,
        type: type,
        animation: "slide-from-top",
        allowOutsideClick: false,
        // timer: 4000
    }, function () {
    });
}