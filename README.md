# students_registration_system

To Run Docker-Compose File:-__
1- Download It from any repo.__
2- Put your local path in it as shown in the file.__
3- open the powershell in this path.__
4- write:-__
	docker-compose up -d__
5- open another terminal to execute the another component in it.__
6- in first terminal run this commands:- __
	docker exec -it students_registration_system-registeration-process-1 bash__
	java Main
7- in second terminal run this commands:- __
	docker exec -it  students_registration_system-student-statistics-process-1 bash__
	java Main
