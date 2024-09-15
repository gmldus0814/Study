function solution(edges) {
    // 정점별 나가는 간선과 들어오는 간선의 개수를 담아둘 객체 생성
    const out = new Map();
    const inMap = new Map();
    let newNode = -1;
    let donut = 0;
    let bar = 0;
    let eight = 0;

    // 간선들을 돌면서 각 정점의 나가는 간선, 들어오는 간선의 개수를 저장
    for (const [from, to] of edges) {
        out.set(from, (out.get(from) || 0) + 1);
        inMap.set(to, (inMap.get(to) || 0) + 1);
    }

    for (const [node, outCount] of out) {
        if (outCount > 1) {
            // 나가는 간선은 2개 이상인데, 들어오는 간선이 없는 정점 : 추가 생성 정점
            if (!inMap.has(node)) {
                newNode = node;
            } 
            // 나가는 간선이 2개 이상이고 들어오는 간선도 1개 이상 : 8자 그래프의 가운데 정점
            else {
                eight++;
            }
        }
    }

    // 나가는 간선이 없는 정점 : 막대 그래프의 마지막 정점
    for (const node of inMap.keys()) {
        if (!out.has(node)) {
            bar++;
        }
    }

    // 추가 생성 정점의 간선 개수는 도넛, 막대, 8자 그래프 수의 합과 같음
    donut = (out.get(newNode) || 0) - bar - eight;

    return [newNode, donut, bar, eight];
}
