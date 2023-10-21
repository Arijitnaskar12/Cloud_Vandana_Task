let form=document.getElementById("survey");
let gender=document.getElementsByClassName("gender");
// Handling Reset
function handleReset(){
    form.reset();
}
// Handling Submit
function handleSubmit(e){
    e.preventDefault();
    let i=0;
    // handling one gender selection
        if(gender[i].checked &&gender[i+1].checked&& gender[i+2].checked ||gender[i].checked &&gender[i+1].checked || gender[i+1].checked &&gender[i+2].checked || gender[i].checked &&gender[i+2].checked)
        {
            alert("Please Select any one of the gender");   
        }else{
            const formData=new FormData(form);
            const popupDetails = [];
            formData.forEach((value,key)=>{
             popupDetails.push(`<strong>${key}:</strong> ${value}`);
            })
            document.getElementById('popupDetails').innerHTML=popupDetails.join('<br>');
            document.getElementById('popup').style.display = 'block';
            
        }
  
}
// handle close popup
function closePopup(){
    document.getElementById('popup').style.display = 'none';
    form.reset();
}