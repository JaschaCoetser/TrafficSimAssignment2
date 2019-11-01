package Model;

//The following is my assignment one road class, however I wasn't able to get to work with my gui
//There for have commented it out so that the gui can run
public class Road {
//    private ArrayList<Node> nodes = new ArrayList<>();
//    RoadType roadtype;
//    Orientation orientation;
//
//    Node northEnter;
//    Node northExit;
//    Node eastEnter;
//    Node eastExit;
//    Node southEnter;
//    Node southExit;
//    Node westEnter;
//    Node westExit;
//    Node topRight;
//    Node topLeft;
//    Node bottomRight;
//    Node bottomLeft;
//
//    public Road(RoadType roadtype, Orientation orientation) {
//        this.roadtype = roadtype;
//        this.orientation = orientation;
//        centreNodes();
//        switch (roadtype) {
//            case STRAIGHT:
//                straight(orientation);
//                break;
//            case CORNERINT:
//                corner(orientation);
//                break;
//            case FOURWAYINT:
//                fourwayint(orientation);
//                break;
//            case THREEWAYINT:
//                threewayint(orientation);
//                break;
//        }
//    }
//
//    private void corner(Orientation orientation) {
//    }
//
//    private void centreNodes() {
//        Node[] centreFour = {topLeft, topRight, bottomLeft, bottomRight};
//        for (int i = 0; i < 4; ++i) {
//            Node tempNode = new Node();
//            centreFour[i] = tempNode;
//            nodes.add(tempNode);
//        }
//    }
//
//
//    private void fourwayint(Orientation orientation) {
//
//        topLeft.nextNodes.add(topRight);
//        topRight.previousNodes.add(topLeft);
//        bottomLeft.previousNodes.add(bottomRight);
//        bottomRight.nextNodes.add(bottomLeft);
//
//        bottomLeft.nextNodes.add(topLeft);
//        topLeft.previousNodes.add(bottomLeft);
//        bottomRight.previousNodes.add(topRight);
//        topRight.nextNodes.add(bottomRight);
//
//
//        // this is the roads exiting
//        Node[] centreFour = {topLeft, topRight, bottomRight, bottomLeft};
//        for (int i = 0; i < 4; ++i) {
//            Node innerTempNode = new Node();
//            Node outerTempNode = new Node();
//            innerTempNode.nextNodes.add(outerTempNode);
//            outerTempNode.previousNodes.add(innerTempNode);
//            innerTempNode.previousNodes.add(centreFour[i]);
//            centreFour[i].nextNodes.add(innerTempNode);
//        }
//        // this is for roads entering
//        Node[] otherCentreFour = {topRight, bottomRight, bottomLeft, topLeft};
//        for (int i = 0; i < 4; ++i) {
//            Node innerTempNode = new Node();
//            Node outerTempNode = new Node();
//            outerTempNode.nextNodes.add(innerTempNode);
//            innerTempNode.previousNodes.add(outerTempNode);
//            innerTempNode.nextNodes.add(otherCentreFour[i]);
//            otherCentreFour[i].previousNodes.add(innerTempNode);
//        }
//    }
//
//    private void threewayint(Orientation orientation) {
//
//    }
//
//
//    private void straight(Orientation orientation) {
//        switch (orientation) {
//            case EAST:
//            case WEST:
//                topLeft.nextNodes.add(topRight);
//                topRight.previousNodes.add(topLeft);
//                bottomLeft.previousNodes.add(bottomRight);
//                bottomRight.nextNodes.add(bottomLeft);
//                break;
//
//            case NORTH:
//            case SOUTH:
//                bottomLeft.nextNodes.add(topLeft);
//                topLeft.previousNodes.add(bottomLeft);
//                bottomRight.previousNodes.add(topRight);
//                topRight.nextNodes.add(bottomRight);
//                break;
//        }
//        // this is the roads exiting
//        Node[] centreTwo = {topLeft, bottomRight};
//        for (int i = 0; i < 2; ++i) {
//            Node innerTempNode = new Node();
//            Node outerTempNode = new Node();
//            innerTempNode.nextNodes.add(outerTempNode);
//            outerTempNode.previousNodes.add(innerTempNode);
//            innerTempNode.previousNodes.add(centreTwo[i]);
//            centreTwo[i].nextNodes.add(innerTempNode);
//        }
//        // this is for roads entering
//        Node[] otherCentreTwo = {topRight, bottomLeft};
//        for (int i = 0; i < 2; ++i) {
//            Node innerTempNode = new Node();
//            Node outerTempNode = new Node();
//            outerTempNode.nextNodes.add(innerTempNode);
//            innerTempNode.previousNodes.add(outerTempNode);
//            innerTempNode.nextNodes.add(otherCentreTwo[i]);
//            otherCentreTwo[i].previousNodes.add(innerTempNode);
//        }
//    }
}
