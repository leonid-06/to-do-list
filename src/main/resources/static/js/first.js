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

function toggleTaskCompletion(taskId, checkbox) {
    var completed = checkbox.checked;

    $.ajax({
        type: 'PUT',
        url: '/updateTaskStatus/' + taskId, // Замените на URL вашего контроллера для обновления статуса
        contentType: 'application/json',
        data: JSON.stringify({ completed: completed }),
        success: function(data) {
            console.log('Статус задачи обновлен.');
            // Добавьте код для обновления интерфейса, если это необходимо
        },
        error: function(xhr, status, error) {
            console.error('Произошла ошибка при обновлении статуса задачи: ' + error);
        }
    });
}



