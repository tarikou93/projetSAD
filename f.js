function sortTableBySalaire() {
var table, rows, switching, i, x, y, shouldSwitch;
table = document.getElementById("myTable");
switching = true;
/*Make a loop that will continue until
no switching has been done:*/
while (switching) {
  //start by saying: no switching is done:
  switching = false;
  rows = table.getElementsByTagName("TR");
  /*Loop through all table rows (except the
  first, which contains table headers):*/
  for (i = 1; i < (rows.length - 1); i++) {
    //start by saying there should be no switching:
    shouldSwitch = false;
    /*Get the two elements you want to compare,
    one from current row and one from the next:*/
    x = rows[i].getElementsByTagName("TD")[7];
    y = rows[i + 1].getElementsByTagName("TD")[7];
    //check if the two rows should switch place:
    if (x.innerHTML < y.innerHTML) {
      //if so, mark as a switch and break the loop:
      shouldSwitch= true;
      break;
    }
  }
  if (shouldSwitch) {
    /*If a switch has been marked, make the switch
    and mark that a switch has been done:*/
    rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
    switching = true;
  }
}
}

function sortTableBySalaire(){
  var table,rows,i,j,x,y;
  table = document.getElementById("myTable");
  rows = table.getElementsByTagName("TR");

  for(i=1; i<(rows.length -2); i++){
    x = rows[i].getElementsByTagName("TD")[7];
    for(j=2; j<(rows.length -1); j++){
      y = rows[j].getElementsByTagName("TD")[7];

      if(y.innerHTML > x.innerHTML){
        rows[i].parentNode.insertBefore(rows[j], rows[i]);
      }
    }
  }

}
