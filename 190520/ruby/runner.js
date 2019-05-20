
const solution = (participant, completion) => {
    let partiPeople = participant.sort()
    let completePeople = completion.sort();
    for ( let i = 0; i < partiPeople.length; i++ ) {
        if ( partiPeople[i] !== completePeople[i] ) {
            return partiPeople[i] 
        }
    }
}

console.log( solution(["mislav", "stanko", "mislav", "ana"],["stanko", "ana", "mislav"]) )