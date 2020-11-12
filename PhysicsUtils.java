
class PhysicsUtils {
    public static void collisionWithWall(Rectangle wall, Ball ball) {
        //posicao minima da coordenada x e y do centro do circulo para a parede
        double ballMinX = wall.x + ball.radius;
        double ballMinY = wall.y + ball.radius;
        //posicao maxima da coordenada x e y do centro do circulo para a parede
        double ballMaxX = wall.getWidth() - ball.radius;
        double ballMaxY = wall.getHeight() - ball.radius;
        //verifica a coordenada x
        if (ball.x < ballMinX) {
            ball.speedX = -ball.speedX; // inverte a velocidade
            ball.x = ballMinX; // reposiciona
        } else if (ball.x > ballMaxX) {
            ball.speedX = -ball.speedX;
            ball.x = ballMaxX;
        }
        //verifica a coordenada y
        if (ball.y < ballMinY) {
            ball.speedY = -ball.speedY;
            ball.y = ballMinY;
        } else if (ball.y > ballMaxY) {
            ball.speedY = -ball.speedY;
            ball.y = ballMaxY;
        }
    }

    public static void intersect(Ball a, Ball b) {
        double distanciaX, distanciaY;
        distanciaX = a.x - b.x;
        distanciaY = a.y - b.y;
        double distanciaQuad = distanciaX * distanciaX + distanciaY * distanciaY;
        // Check the squared distances instead of the the distances, same
        // result, but avoids a square root.
        if (distanciaQuad <= (a.radius + b.radius) * (a.radius + b.radius)) {
            double speedXocity = b.speedX - a.speedX;
            double speedYocity = b.speedY - a.speedY;
            double dotProduct = distanciaX * speedXocity + distanciaY * speedYocity;
            // Neat vector maths, used for checking if the objects moves towards
            // one another.
            if (dotProduct > 0) {
                double collisionScale = dotProduct / distanciaQuad;
                double xCollision = distanciaX * collisionScale;
                double yCollision = distanciaY * collisionScale;
                // The Collision vector is the speed difference projected on the
                // Dist vector,
                // thus it is the component of the speed difference needed for
                // the collision.
                double combinedMass = a.getMass() + b.getMass();
                double collisionWeightA = 2 * b.getMass() / combinedMass;
                double collisionWeightB = 2 * a.getMass() / combinedMass;
                a.speedX += (collisionWeightA * xCollision);
                a.speedY += (collisionWeightA * yCollision);
                b.speedX -= (collisionWeightB * xCollision);
                b.speedY -= (collisionWeightB * yCollision);
            }
        }
    }


}
