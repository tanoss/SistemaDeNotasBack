/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.vo;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author willy
 */
@Service
public class libretanotaVo {

    private static String opciones = " from libreta l"
            + " inner join clase c on l.id_clase = c.id_clase"
            + " inner join materia_docente_grado mdg on c.id_materia_docente_grado= mdg.id_materia_docente_grado"
            + " inner join materia m on mdg.id_materia= m.id_materia"
            + " inner join docente d on mdg.id_docente = d.id_docente"
            + " inner join estudiante e on c.id_estudiante = e.id_estudiante"
            + " inner join persona p on e.id_persona = p.id_persona ";

    private static String usuarioperfil = " from siseac.seg_usuario_ldap u"
            + " join siseac.seg_usu_perfil_ldap up on up.usu_id=u.usu_id"
            + " join siseac.seg_perfil p on p.per_id=up.per_id"
            + " join siseac.seg_sistemas s on s.sis_id=p.sis_id";

    private static String usuariossistemas = " from SISEAC.seg_usuario_ldap ul "
            + " INNER JOIN SISEAC.seg_usu_perfil_ldap up ON  "
            + " ul.usu_id  = up.usu_id "
            + " INNER JOIN SISEAC.seg_perfil p ON  "
            + " up.per_id  = p.per_id "
            + " INNER JOIN SISEAC.seg_sistemas s ON  "
            + " p.sis_id = s.sis_id ";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<libretaVo> getLibreta(String q) throws SQLException {
        String opcion = "select materia,id_libreta,l.id_clase, id_periodo_lectivo, nota_quimestre_uno, nota_quimestre_dos,promedio_final";
        return jdbcTemplate.query(opcion + opciones + q, new BeanPropertyRowMapper<>(libretaVo.class));
    }

}
