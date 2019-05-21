function solution(array, commands) {
  return commands.map(([from, to, index]) => array.slice(from - 1, to).sort((x,y) => (x - y).slice())[index - 1])
} 

