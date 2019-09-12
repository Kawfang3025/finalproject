function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
    document.body.style.backgroundColor = "rgba(0,0,0,0.4)";
  }
  
  function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("main").style.marginLeft= "0";
    document.body.style.backgroundColor = "white";
  }
  var IP = localStorage.getItem("IP");
  var ID = 0;
    var xmlhttp = new XMLHttpRequest();
    var email = localStorage.getItem("email");
    var url1 = "http://"+IP+":8080/technicains";
    xmlhttp.open("GET", url1, false);
    xmlhttp.send();
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
        var output = xmlhttp.responseText;
        var jsoutput = JSON.parse(output);
        for (let i = 0; i < jsoutput.length; i++) {
            if (email === jsoutput[i].e_mail) {
                ID = jsoutput[i].technicainID;
                document.getElementById("fname").innerHTML = jsoutput[i].firstName + " " + jsoutput[i].lastName;
                document.getElementById("position").innerHTML = jsoutput[i].positions;
                localStorage.setItem("position",jsoutput[i].positions);
            }
        }
        if (ID === 0) {
            url2 = "http://localhost:8080/employees";
            xmlhttp.open("GET", url2, false);
            xmlhttp.send();
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                var output = xmlhttp.responseText;
                var jsoutput = JSON.parse(output);
                for (let i = 0; i < jsoutput.length; i++) {
                    if (email === jsoutput[i].e_mail) {
                        document.getElementById("fname").innerHTML = jsoutput[i].firstName + " " + jsoutput[i].lastName;
                        document.getElementById("position").innerHTML = jsoutput[i].positions;
                        localStorage.setItem("position",jsoutput[i].positions);
                    }
                }
            }
        }
    }