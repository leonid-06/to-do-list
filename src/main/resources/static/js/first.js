function deleteTask(taskId) {
    $.ajax({
        type: 'DELETE',
        url: '/deleteTask/' + taskId,
        success: function(data) {
            console.log('Success');
            window.location.href = '/alltask';
        },
        error: function(xhr, status, error) {
            console.error('Error: ' + error);
        }
    });
}


