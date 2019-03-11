$(document).ready(function() {
    getCourse("gold");
    function getCourse(name) {

        $.ajax({
            url: "http://api.nbp.pl/api/cenyzlota/today/?format=json"
        }).then(function (data) {
            $("#gold").append(data[0].cena);  //odnosimy sie do Jasona bid
//jak jest klasa to jest kropka jak jest ID to jest #
        });
    }
});