//createTable.js => 타이틀 배열,데이터 배열.
//table 작성
function createTable(titleAry, dataAry){
    //tr생성해주는 함수.
    function makeRow(obj){
        var tr = document.createElement('tr');
		tr.setAttribute('id',obj.employeeId); //tr에 id속성으로 employeeId값으로 지정
        titleAry.forEach(field =>{
            var td = document.createElement('td');
            td.textContent = obj[field];
            tr.appendChild(td);
        })
        
        return tr;
    }
    //table 작성
    var table = document.createElement('table');
    table.setAttribute('border','1');
    // thaed 작성
    var thead = document.createElement('thead');
    var tr = document.createElement('tr');
    thead.appendChild(tr);
    titleAry.forEach(item =>{
        var th = document.createElement('th');
        th.textContent = item;
        tr.appendChild(th);
    });
    

    //tbody작성
    var tbody = document.createElement('tbody');
    dataAry.forEach(item =>{
        tbody.appendChild(makeRow(item));
        
    });

    table.append(thead, tbody);
    return table;
}