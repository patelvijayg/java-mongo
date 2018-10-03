oc new-app redhat-openjdk18-openshift~https://github.com/patelvijayg/java-mongo --name java-mongo

for deployment on online openshift

curl -X POST \
  http://javamonogdb1-javaproject.a3c1.starter-us-west-1.openshiftapps.com/api/users \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/json' \
  -d '{
	"id":"vili1015",
	"name":"vijay",
	"age":37
}'

curl -X GET http://javamonogdb1-javaproject.a3c1.starter-us-west-1.openshiftapps.com/api/users  -H 'Content-Type: application/json' 
