
$(document).ready(function(){

    $('.nBtn, .table .eBtn').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        var text = $(this).text();
        if(text=='Edit') {
            $.get(href, function (item,status) {
                $('.myForm #id').val(item.taskId);
                $('.myForm #title').val(item.taskTitle);
                $('.myForm #description').val(item.taskDescription);
            });

            $('.myForm #exampleModal').modal();
        }else{
            $('.myForm #title').val('');
            $('.myForm #description').val('');
            $('.myForm #exampleModal').modal();
        }
    });

    $('.table .delBtn').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $('#myModal #delRef').attr('href',href);
        $('#myModal').modal();
    });
});