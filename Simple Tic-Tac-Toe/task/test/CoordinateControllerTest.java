import move.CoordinateController;
import org.junit.Assert;
import org.junit.Test;

public class CoordinateControllerTest {

    @Test
    public void withoutSpaces_test(){
        //given
        String moveCoor = "1 1";
        CoordinateController coordinateController = new CoordinateController();

        //when
        String result = coordinateController.withoutSpaces(moveCoor);

        //then
        Assert.assertEquals("11", result);
    }

    @Test
    public void getCoor1_test(){
        //given
        String moveCoor = "1 2";
        CoordinateController coordinateController = new CoordinateController();

        //when
        int result = coordinateController.getCoor1(moveCoor);

        //then
        Assert.assertEquals(1, result);
    }

    @Test
    public void getCoor2_test(){
        //given
        String moveCoor = "1 2";
        CoordinateController coordinateController = new CoordinateController();

        //when
        int result = coordinateController.getCoor2(moveCoor);

        //then
        Assert.assertEquals(2, result);
    }

    @Test
    public void gridPosition_test(){
        //given
        int coor1 = 1;
        int coor2 = 2;
        CoordinateController coordinateController = new CoordinateController();

        //when
        int result = coordinateController.gridPosition(1,2);

        //then
        Assert.assertEquals(1, result);
    }
}
