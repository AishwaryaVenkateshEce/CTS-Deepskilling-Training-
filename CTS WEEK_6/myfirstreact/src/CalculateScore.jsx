import React from 'react';
import "../Stylesheets/mystyle.css";
function CalculateScore(props) {
 const average=props.Total/props.Goal;
 return(
    <div className="score-card">
        <h2>Student Score Details</h2>
        <p><strong>Name:</strong>{props.Name}</p>
        <p><strong>College:</strong>{props.College}</p>
        <p><strong>Total Marks:</strong>{props.Total}</p>
        <p><strong>Goal:</strong>{props.Goal}</p>
        <p><strong>Average Score:</strong>{average.toFixed(2)}</p>
    </div>
 );
}

export default CalculateScore;