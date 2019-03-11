$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/exchangerates/eur/today"
    }).then(function(data) {
        $('.greeting-id').append(data.rates[0].bid);  //odnosimy sie do Jasona bid
        $('.greeting-content').append(data.rates[0].ask);   //odnosimy sie do Jason ask
    });
});