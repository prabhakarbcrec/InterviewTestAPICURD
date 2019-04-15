# InterviewTestAPICURD
Company Assignment
Here i am using H2 database to store all task along with their column like id,name,Priority, category... 
and i did CURD opration on this table using vrious API.
there are four API to update ,delete, generate task and view all task.
1. /getAllTask GET METHOD 
this API is responsible for get the data from H2 databse (all data mean task)
2. /getTask 
this is responsible for get task on the basis of priority ...
you have to pass priority of task as a parameter.
3. /addTask 
this APi is responsible for add new task to databse you have to pass all colunm value at API calling time.
@RequestParam("id") int id,@RequestParam("name") String name,
@RequestParam("category") String category,@RequestParam("Priority") String Priority

4. /deteteTask this API is responsible for delete any task on the basis of their task category.
that mean's you have to pass category at API calling as a parameter.
