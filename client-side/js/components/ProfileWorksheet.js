export default function ProfileWorksheet(worksheet) {
    const date = new Date(worksheet.timeStampMillis);
    console.log(date.toLocaleString());
    return `
        <div class="profile_worksheet__container">
            <input type='hidden' class='worksheetId' value='${worksheet.id}'/>
            <h2 class="title"> ${worksheet.title} </h2>
            <p>Submitted on ${date.toLocaleString()} </p>
            <br />
            <p class ="answer"> ${worksheet.answer1}</p>
            <p class ="answer"> ${worksheet.answer2}</p>
            <p class ="answer"> ${worksheet.answer3}</p>
            <p class ="answer"> ${worksheet.answer4}</p>
        </div>
    `;
}


