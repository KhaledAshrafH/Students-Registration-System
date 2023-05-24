# students_registration_system

To Run Docker-Compose File:-
1- Download It from any repo.
2- Put your local path in it as shown in the file.
3- open the powershell in this path.
4- write:-
	docker-compose up -d
5- open another terminal to execute the another component in it.
6- in first terminal run this commands:- 
	docker exec -it students_registration_system-registeration-process-1 bash
	java Main
7- in second terminal run this commands:- 
	docker exec -it  students_registration_system-student-statistics-process-1 bash
	java Main
