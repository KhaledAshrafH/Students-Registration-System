# students_registration_system
<pre>
To Run Docker-Compose File:-<br />
1- Download It from any repo.<br />
2- Put your local path in it as shown in the file.<br />
3- open the powershell in this path.<br />
4- write:-<br />
	docker-compose up -d<br />
5- open another terminal to execute the another component in it.<br />
6- in first terminal run this commands:- <br />
	docker exec -it students_registration_system-registeration-process-1 bash<br />
	java Main<br />
7- in second terminal run this commands:-<br />
	docker exec -it  students_registration_system-student-statistics-process-1 bash<br />
	java Main
</pre>
